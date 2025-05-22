import java.util.Stack;

public class asteroidCollision {
      public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int a : asteroids) {
            boolean destroyed = false;

            while (!stack.isEmpty() && stack.peek() > 0 && a < 0) {
                int top = stack.peek();
                if (Math.abs(a) > top) {
                    stack.pop(); // top explodes, continue checking
                } else if (Math.abs(a) == top) {
                    stack.pop(); // both explode
                    destroyed = true;
                    break;
                } else {
                    // incoming asteroid explodes
                    destroyed = true;
                    break;
                }
            }

            if (!destroyed) {
                stack.push(a);
            }
        }

        // Convert stack to array
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }

}
