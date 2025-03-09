package mate.academy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RevealCards {
    public static int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n = deck.length;
        int[] result = new int[n];
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.offer(i);
        }
        for (int card : deck) {
            result[queue.poll()] = card;
            if (!queue.isEmpty()) {
                queue.offer(queue.poll());
            }
        }
        return result;
    }
}
