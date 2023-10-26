import java.util.*;
import java.util.Map.Entry;

public class DijkstraAlgorithm {
    public static Map<String, Integer> dijkstra(Map<String, Map<String, Integer>> graph, String start) {
        Map<String, Integer> distances = new HashMap<>();
        for (String node : graph.keySet()) {
            distances.put(node, Integer.MAX_VALUE);
        }
        distances.put(start, 0);

        PriorityQueue<Entry<String, Integer>> queue = new PriorityQueue<>(Comparator.comparing(Entry::getValue));
        queue.add(new AbstractMap.SimpleEntry<>(start, 0));

        while (!queue.isEmpty()) {
            String currentNode = queue.poll().getKey();
            for (Entry<String, Integer> neighbor : graph.get(currentNode).entrySet()) {
                int potentialDistance = distances.get(currentNode) + neighbor.getValue();
                if (potentialDistance < distances.get(neighbor.getKey())) {
                    distances.put(neighbor.getKey(), potentialDistance);
                    queue.add(new AbstractMap.SimpleEntry<>(neighbor.getKey(), potentialDistance));
                }
            }
        }
        return distances;
    }

    public static void main(String[] args) {
        Map<String, Map<String, Integer>> graph = new HashMap<>();
        graph.put("A", Map.of("B", 1, "C", 4));
        graph.put("B", Map.of("A", 1, "C", 2, "D", 5));
        graph.put("C", Map.of("A", 4, "B", 2, "D", 1));
        graph.put("D", Map.of("B", 5, "C", 1));

        String startNode = "A";
        Map<String, Integer> distances = dijkstra(graph, startNode);

        for (Entry<String, Integer> entry : distances.entrySet()) {
            System.out.println("Distance from " + startNode + " to " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
