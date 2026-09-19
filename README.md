# Horse Fence Calculator (Project 1)

A Java console program designed to help users calculate the exact number of posts, boards, and total material costs required to build a rectangular horse fence. 

## Features
* **Fence Perimeter Calculation:** Automatically computes total perimeter based on user-inputted length and width.
* **Input Validation:** 
  * Verifies that the total fence length is evenly divisible by the desired post distance.
  * Ensures that board lengths are not shorter than the distance between posts.
* **Custom Layers & Sizing:** Accounts for single-layer board requirements and multiplies them by user-defined custom post layers (e.g., 3-board fence).
* **Cost Estimation:** Calculates individual material costs for posts and boards, along with a final grand total for the project.

## Pseudocode
The program includes the initial algorithmic blueprint outlining the logic and validation checks at the beginning of the `Main.java` file.

## How to Run
1. Open the project in an IDE (such as IntelliJ IDEA).
2. Run the `Main.java` file.
3. Follow the on-screen prompts to enter:
   - Fence length and width (in feet)
   - Post distance (in feet)
   - Board length (in feet)
   - Number of board layers across posts
   - Cost per post and cost per board
