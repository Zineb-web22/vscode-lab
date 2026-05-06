package com.example.refactoring;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderProcessorTest {
    @Test
    public void testPrintOrderSummary() {
        Customer customer = new Customer("John Doe", true);
        Item item1 = new Item("Apple", 1.0, 10);
        Item item2 = new Item("Banana", 0.5, 20);
        Order order = new Order(customer, Arrays.asList(item1, item2));

        OrderProcessor processor = new OrderProcessor();
        
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        processor.printOrderSummary(order);

        String output = outContent.toString();
        // Total price calculation: (1.0*10 + 0.5*20) * 0.9 = (10 + 10) * 0.9 = 18.0
        assertTrue(output.contains("Total Price: $18.00"));
        assertTrue(output.contains("Customer: John Doe"));
        
        System.setOut(System.out); // Reset System.out
    }
}
