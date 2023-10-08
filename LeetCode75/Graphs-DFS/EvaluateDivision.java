class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> graph = buildGraph(equations, values);
        double[] results = new double[queries.size()];

        for (int i = 0; i < queries.size(); i++) {
            List<String> query = queries.get(i);
            String source = query.get(0);
            String destination = query.get(1);
            results[i] = evaluateQuery(source, destination, graph, new HashMap<>());
        }

        return results;
    }
    private Map<String, Map<String, Double>> buildGraph(List<List<String>> equations, double[] values) {
        Map<String, Map<String, Double>> graph = new HashMap<>();

        for (int i = 0; i < equations.size(); i++) {
            List<String> equation = equations.get(i);
            String dividend = equation.get(0);
            String divisor = equation.get(1);
            double value = values[i];

            graph.putIfAbsent(dividend, new HashMap<>());
            graph.putIfAbsent(divisor, new HashMap<>());

            graph.get(dividend).put(divisor, value);
            graph.get(divisor).put(dividend, 1.0 / value);
        }

        return graph;
    }
    private double evaluateQuery(String source, String destination, Map<String, Map<String, Double>> graph,
                                 Map<String, Boolean> visited) {
        if (!graph.containsKey(source) || !graph.containsKey(destination))
            return -1.0;

        if (source.equals(destination))
            return 1.0;

        visited.put(source, true);
        Map<String, Double> neighbors = graph.get(source);

        for (Map.Entry<String, Double> neighbor : neighbors.entrySet()) {
            String next = neighbor.getKey();
            double value = neighbor.getValue();

            if (!visited.containsKey(next)) {
                double result = evaluateQuery(next, destination, graph, visited);

                if (result != -1.0)
                    return value * result;
            }
        }

        return -1.0;
    }
}
