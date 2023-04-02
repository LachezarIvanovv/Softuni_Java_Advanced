package SetsAndMaps.lab;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Map<String, List<Double>>> map = new TreeMap<>();

        while(!input.equals("Revision")){
            String[] data = input.split(", ");
            String shop = data[0];
            String product = data[1];
            Double price = Double.parseDouble(data[2]);

            map.putIfAbsent(shop, new LinkedHashMap<>());
            Map<String, List<Double>> productsWithPrices = map.get(shop);
            productsWithPrices.putIfAbsent(product, new ArrayList<>());
            List<Double> prices = productsWithPrices.get(product);
            prices.add(price);

            input = scanner.nextLine();
        }
        map.entrySet()
                .forEach(entry ->{
                    System.out.println(entry.getKey() + "->");
                    Map<String, List<Double>> productWithPrices = entry.getValue();
                    productWithPrices.entrySet()
                            .forEach(e ->{
                                List<String> stream = e.getValue().stream()
                                        .map(element -> String.format("%.1f", element))
                                        .collect(Collectors.toList());
                                String result = String.join("", stream);
                                System.out.println("Product: " + e.getKey() + ", " + "Price: "
                                        + result);
                            });
                });
    }
}
