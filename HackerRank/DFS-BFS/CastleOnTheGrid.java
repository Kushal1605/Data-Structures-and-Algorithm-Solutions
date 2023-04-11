import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class CastleOnTheGrid {
    public static int minimumMoves(List<String> grid, int startX, int startY, int goalX, int goalY) {
        int l = grid.size();
        Queue<Map.Entry<Integer, Integer>> q = new LinkedList<>();
        int [][] visited = new int[l][l];
        List<List<Map.Entry<Integer, Integer>>> preceder = new ArrayList<>();
        Map.Entry<Integer, Integer> v = Map.entry(startX, startY);
        visited[startX][startY] = -1;
        q.add(Map.entry(startX, startY));
        for(int i = 0; i < l; i++) {
            List<Map.Entry<Integer, Integer>> list = new ArrayList<>();
            for(int j = 0; j < l; j++) {
                list.add(v);
            }
            preceder.add(list);
        }

        while(!q.isEmpty() && !q.contains(Map.entry(goalX, goalY))) {
            v = q.poll();
            if(grid.get(v.getKey()).charAt(v.getValue()) == 'X')
                continue;
            for(int i = v.getValue() + 1; i < l; i++) {
                if(grid.get(v.getKey()).charAt(i) == 'X') {
                    q.add(Map.entry(v.getKey(), i));
                    visited[v.getKey()][i] = -1;
                    preceder.get(v.getKey()).set(i, v);
                    break;
                }
                if(visited[v.getKey()][i] == -1 || visited[v.getKey()][i] == 1)
                    continue;
                q.add(Map.entry(v.getKey(), i));
                visited[v.getKey()][i] = -1;
                preceder.get(v.getKey()).set(i, v);
            }
            for(int i = v.getValue() - 1; i >= 0; i--) {
                if(grid.get(v.getKey()).charAt(i) == 'X') {
                    q.add(Map.entry(v.getKey(), i));
                    visited[v.getKey()][i] = -1;
                    preceder.get(v.getKey()).set(i, v);
                    break;
                }
                if(visited[v.getKey()][i] == -1 || visited[v.getKey()][i] == 1)
                    continue;
                q.add(Map.entry(v.getKey(), i));
                visited[v.getKey()][i] = -1;
                preceder.get(v.getKey()).set(i, v);
            }
            for(int i = v.getKey() + 1; i < l; i++) {
                if(grid.get(i).charAt(v.getValue()) == 'X') {
                    q.add(Map.entry(i, v.getValue()));
                    visited[i][v.getValue()] = -1;
                    preceder.get(i).set(v.getValue(), v);    
                    break;
                }
                if(visited[i][v.getValue()] == -1 || visited[i][v.getValue()] == 1)
                    continue;
                q.add(Map.entry(i, v.getValue()));
                visited[i][v.getValue()] = -1;
                preceder.get(i).set(v.getValue(), v);
            }
            for(int i = v.getKey() - 1; i >= 0; i--) {
                if(grid.get(i).charAt(v.getValue()) == 'X') {
                    q.add(Map.entry(i, v.getValue()));
                    visited[i][v.getValue()] = -1;
                    preceder.get(i).set(v.getValue(), v);    
                    break;
                }
                if(visited[i][v.getValue()] == -1 || visited[i][v.getValue()] == 1)
                    continue;    
                q.add(Map.entry(i, v.getValue()));
                visited[i][v.getValue()] = -1;
                preceder.get(i).set(v.getValue(), v);
            }
            visited[v.getKey()][v.getValue()] = 1;
        }
        Stack<Map.Entry<Integer, Integer>> stack = new Stack<>();
        stack.push(Map.entry(goalX, goalY));
        while(!(stack.peek().getKey() == startX && stack.peek().getValue() == startY)) {
            stack.push(preceder.get(stack.peek().getKey()).get(stack.peek().getValue()));
        }
        int res = 0;
        while(!stack.isEmpty()) {
            stack.pop();
            res += 1;
        }
        return res - 1;
    }
    public static void main(String[] args) {
        List<String> grid = new ArrayList<>();
        grid.add("...");
        grid.add(".X.");
        grid.add("...");
        System.out.println(minimumMoves(grid, 0, 0, 1, 1));
    }
}
