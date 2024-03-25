package BackTracking;
import java.util.*;

public class RatInAMaze {
    static int N;
    static List<String> findPaths(int[][] maze, int n) {
        N = n;
        List<String> paths = new ArrayList<>();
        boolean[][] visited = new boolean[N][N];
        StringBuilder path = new StringBuilder();
        // Check if the starting cell is blocked
        if (maze[0][0] == 0) {
            return paths;
            // Return empty list since the rat cannot enter the maze
        }
        searchInMaze(maze, 0, 0, visited, path, paths);
        return paths;
    }
    static void searchInMaze(int[][] maze, int i, int j, boolean[][] visited, StringBuilder path, List<String> paths) {
        // Base case: If the rat has reached the destination
        if (i == N - 1 && j == N - 1) {
            paths.add(path.toString());
            return;
        }

        // Mark the current cell as visited.......Try all possible directions (up, down, left, right)
        visited[i][j] = true;
        //Down
        if (isSafe(maze, i + 1, j, visited)) {
            path.append("D");
            searchInMaze(maze, i + 1, j, visited, path, paths);
            path.deleteCharAt(path.length() - 1);
        }
        //Up
        if (isSafe(maze, i - 1, j, visited)) {
            path.append("U");
            searchInMaze(maze, i - 1, j, visited, path, paths);
            path.deleteCharAt(path.length() - 1);
        }
        //Left
        if (isSafe(maze, i, j - 1, visited)) {
            path.append("L");
            searchInMaze(maze, i, j - 1, visited, path, paths);
            path.deleteCharAt(path.length() - 1);
        }
        //Right
        if (isSafe(maze, i, j + 1, visited)) {
            path.append("R");
            searchInMaze(maze, i, j + 1, visited, path, paths);
            path.deleteCharAt(path.length() - 1);
        }

        // Mark the current cell as unvisited for backtracking
        visited[i][j] = false;
    }

    static boolean isSafe(int[][] maze, int i, int j, boolean[][] visited) {
        // Check if the cell is within the bounds of the maze and
        // not blocked and not already visited
        if ((i >= 0 && i < N && j >= 0 && j < N && maze[i][j] == 1 && !visited[i][j]))
        return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };
        int N = 4;

        List<String> paths = findPaths(maze, N);

        System.out.println("All possible paths:");
        for (String path : paths) {
            System.out.println(path);
        }
    }
}
