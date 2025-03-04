# Reveal cards in increasing order

You are given an array of integers called deck. This array represents a deck of cards, where each card has a unique integer value. The integer on the i-th (n-th) card is represented by deck[i].

Initially, all cards are face down in one deck. The goal is to reveal all cards in ascending order, following these steps:

1. We draw the top card from the deck, reveal it, and take it from the deck.

2. If there are still cards left in the deck, place the next top card on the bottom of the deck.

3. Repeat steps 1 and 2 until all cards are revealed.

The player's goal is to return an order in the deck that allows the cards to be revealed in ascending order. The first value in the solution is treated as the top card of the deck.

## Example 1:
Expected: deck = [17,13,11,2,3,5,7]

Given: [2,13,3,11,5,17,7] 

Explanation:
- Start with the deck in any order, e.g. [17,13,11,2,3,5,7].
- Change the order to [2,13,3,11,5,17,7]:
  - Start by shuffling the cards: [2,3,5,7,11,13,17]. Additionally, create a new index queue: [0, 1, 2, 3, 4, 5, 6].
  - Start by creating a new, empty deck: [0, 0, 0, 0, 0, 0, 0]
- Place the first card (2) in the new collection (this is step #1 in the task description): [2, 0, 0, 0, 0, 0], in the index queue: [1, 2, 3, 4, 5, 6]
  - Since the deck still contains cards (step #2 in the task description), place the top card on the bottom of the deck: [2, 3, 4, 5, 6, 1]
  - According to step #3 in the task description, continue and remove a card from the top (step #1): [2, 0, 3, 0, 0, 0], index queue: [3, 4, 5, 6, 1]
  - Continue with step #2 - Place the next top card on the bottom of the deck: [4, 5, 6, 1, 3]
  - In next iteration your new array will look like this: [2, 0, 3, 0, 5, 0, 0], queue indices: [5, 6, 1, 3]
  - Place the next top card on the bottom of the deck: [6, 1, 3, 5]
  - next iteration your new array will look like this: [2, 0, 3, 0, 5, 0, 7], queue indices: [1, 3, 5]
  - next iteration your new array will look like this: [2, 0, 3, 11, 5, 0, 7], queue indices: [5, 1]
  - next iteration your new array will look like this: [2, 13, 3, 11, 5, 0, 7], queue indices: [5]
  - next iteration your new array will look like this: [2, 13, 3, 11, 5, 17, 7], the index queue is empty.

## Example 2:
Expected: deck = [1,1000]

Getting: [1,1000]

Constraints:

1 <= deck.length <= 1000

1 <= deck[i] <= 10^6

All values in the decks array are distinct.