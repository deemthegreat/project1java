package project1java;

import java.lang.reflect.GenericDeclaration;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

// Ask the user for inputs (Fence Area)
        System.out.println("Enter the length of the fenced area in feet :");
        double length = Double.parseDouble(keyboard.nextLine());

        System.out.println("Enter the width of the fenced area in feet :");
        double width = Double.parseDouble(keyboard.nextLine());

        System.out.println("Enter the distance between posts in feet :");
        double postDistance = Double.parseDouble(keyboard.nextLine());

// Calculate total fence length
        double totalFenceLength;
        totalFenceLength = (2 * (length + width));

// Validate Post Distance
        if (totalFenceLength % postDistance != 0) {
            System.out.println("Error: Fence length is not evenly divisible by post distance. Please run the program again");
            System.exit(0);
        }

// Calculate Posts
        double totalPosts = totalFenceLength / postDistance;

// Ask the user for inputs (Board Details)
        System.out.println("Enter the length of the boards you plan to use in feet :");
        double boardLength = Double.parseDouble(keyboard.nextLine());

// Validate Board Length
        if (boardLength < postDistance) {
            System.out.println("Error : Board length cannot be less than post distance. Please run the program again");
            System.exit(0);
        }

// Calculate boards for a single layer
        int boardPerLayer = (int) Math.ceil(totalFenceLength / boardLength);

// Ask the user for inputs (Layers and Costs)
        System.out.println("How many boards do you want to run across each post?");
        double layers = Double.parseDouble(keyboard.nextLine());

        System.out.println("Enter the cost of each post: ");
        double costPerPost = Double.parseDouble(keyboard.nextLine());

        System.out.println("Enter the cost of each board :");
        double costPerBoard = Double.parseDouble(keyboard.nextLine());

// Calculate final totals and costs
        double totalBoards = boardPerLayer * layers;
        double totalPostCost = totalPosts * costPerPost;
        double totalBoardCost = totalBoards * costPerBoard;
        double grandTotal = totalPostCost + totalBoardCost;

// (output) List all of the information gathered and calculated
        System.out.println("Total posts required : " + totalPosts);
        System.out.println("Total boards required : " + totalBoards);
        System.out.println("Total cost of posts : " + totalPostCost);
        System.out.println("Total cost of boards : " + totalBoardCost);
        System.out.println("Grand total for project : " + grandTotal);



    }
}