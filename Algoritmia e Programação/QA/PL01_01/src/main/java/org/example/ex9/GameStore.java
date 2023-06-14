package org.example.ex9;

import java.util.ArrayList;

public class GameStore {
    private ArrayList<VideoGame> stock;
    private ArrayList<VideoGame> sales;

    public GameStore() {
        stock = new ArrayList<>();
        sales = new ArrayList<>();
    }

    public void addGameToStock(VideoGame game) {
        stock.add(game);
    }

    public void sellGame(int index) {
        VideoGame game = stock.remove(index);
        sales.add(new VideoGame(game.getName(), game.getPublisher(), game.getCostPrice(),
                game.getSellingPrice()));
    }

    public void displayStock() {
        System.out.println("Stock:");
        for (VideoGame game : stock) {
            System.out.println("Name: " + game.getName());
            System.out.println("Publisher: " + game.getPublisher());
            System.out.println("Cost Price: " + game.getCostPrice());
            System.out.println("Selling Price: " + game.getSellingPrice());
            System.out.println("---------------------------");
        }
    }

    public void displaySales() {
        System.out.println("Sales:");
        for (VideoGame game : sales) {
            System.out.println("Name: " + game.getName());
            System.out.println("Publisher: " + game.getPublisher());
            System.out.println("Cost Price: " + game.getCostPrice());
            System.out.println("Selling Price: " + game.getSellingPrice());
            System.out.println("---------------------------");
        }
    }

    public double calculateProfit(){
        double total_revenue = 0;
        double total_cost = 0;

        for (VideoGame game : sales){
            total_revenue += game.getSellingPrice();
        }
        for (VideoGame game : sales){
            total_cost += game.getCostPrice();
        }
        double total = total_revenue - total_cost;
        return total;

    }

    public ArrayList<VideoGame> getStock() {
        return stock;
    }

    public void setStock(ArrayList<VideoGame> stock) {
        this.stock = stock;
    }

    public ArrayList<VideoGame> getSales() {
        return sales;
    }

    public void setSales(ArrayList<VideoGame> sales) {
        this.sales = sales;
    }
}