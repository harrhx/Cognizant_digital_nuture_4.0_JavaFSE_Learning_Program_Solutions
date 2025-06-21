import java.util.Arrays;

class Order {
    String orderId;
    String customerName;
    double totalPrice;

    public Order(String orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + orderId + '\'' +
                ", customer='" + customerName + '\'' +
                ", price=" + String.format("%.2f", totalPrice) +
                '}';
    }
}

public class EcommerceSort {

    public static void bubbleSort(Order[] orders) {
        int listSize = orders.length;
        for (int i = 0; i < listSize - 1; i++) {
            for (int j = 0; j < listSize - i - 1; j++) {
                if (orders[j].getTotalPrice() > orders[j + 1].getTotalPrice()) {
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    public static void quickSort(Order[] orders, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(orders, begin, end);
            quickSort(orders, begin, partitionIndex - 1);
            quickSort(orders, partitionIndex + 1, end);
        }
    }

    private static int partition(Order[] orders, int begin, int end) {
        Order pivot = orders[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (orders[j].getTotalPrice() <= pivot.getTotalPrice()) {
                i++;
                Order swapTemp = orders[i];
                orders[i] = orders[j];
                orders[j] = swapTemp;
            }
        }

        Order swapTemp = orders[i + 1];
        orders[i + 1] = orders[end];
        orders[end] = swapTemp;

        return i + 1;
    }

    private static void printOrders(String message, Order[] orders) {
        System.out.println(message);
        for (Order order : orders) {
            System.out.println("  " + order);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Order[] orders = {
                new Order("A124", "John Smith", 99.99),
                new Order("B789", "Jane Doe", 250.50),
                new Order("C456", "Sam Brown", 45.75),
                new Order("D101", "Lisa White", 300.00),
                new Order("E234", "Chris Green", 120.00)
        };

        Order[] ordersForBubble = Arrays.copyOf(orders, orders.length);
        Order[] ordersForQuick = Arrays.copyOf(orders, orders.length);

        printOrders("Original list of orders:", orders);

        System.out.println("--- Starting Bubble Sort ---");
        long bubbleStartTime = System.nanoTime();
        bubbleSort(ordersForBubble);
        long bubbleEndTime = System.nanoTime();
        printOrders("Orders sorted with Bubble Sort:", ordersForBubble);
        System.out.println("Bubble Sort took: " + (bubbleEndTime - bubbleStartTime) + " nanoseconds.\n");

        System.out.println("--- Starting Quick Sort ---");
        long quickStartTime = System.nanoTime();
        quickSort(ordersForQuick, 0, ordersForQuick.length - 1);
        long quickEndTime = System.nanoTime();
        printOrders("Orders sorted with Quick Sort:", ordersForQuick);
        System.out.println("Quick Sort took: " + (quickEndTime - quickStartTime) + " nanoseconds.\n");
    }
}
