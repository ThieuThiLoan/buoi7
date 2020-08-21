/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi7;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Buoi7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bookManagement bookManangement = new bookManagement();
        while(true){
            System.out.println("1.Show");
            System.out.println("2.Add");
            System.out.println("3.Delelte");
            System.out.println("4.Update");
            System.out.println("Show types Book");
            System.out.println("8.Exit");
            int inputUser = sc.nextInt();
            sc.nextLine();
            switch(inputUser){
                case 1:
                    bookManagement.showLibrary();
                    break;
                case 2:
                    System.out.println("Name:");
                    String name = sc.nextLine();
                    System.out.println("Origin:");
                    String origin = sc.nextLine();
                    System.out.println("Type:");
                    String type = sc.nextLine();
                    System.out.println("Price:");
                    int price = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Number of page:");
                    int soTrang = sc.nextInt();
                    sc.nextLine();
                    book p = new book(name, origin, type, price, soTrang);
                    boolean result = bookManangement.addbook(p);
                    if (result){
                        System.out.println("Success");
                    }else {
                        System.out.println("Fail");
                    }
                    break;
                case 3:
                    System.out.println("Nhap vao ten sach muon xoa:");
                    String deleteBookName = sc.nextLine();
                    int response = bookManagement.deleteBook(deleteBookName);
                    if(response==1){
                        System.out.println("Success");
                    }else if(response == -1){
                        System.out.println("Book not found");
                    }else {
                        System.out.println("Fail");
                    }
                    break;
                case 4:  
                    System.out.println("Nhap vao ten sach muon sua:");
                    String nameUpdateBook = sc.nextLine();
                    if (bookManagement.isExistBook(nameUpdateBook)) {
                        System.out.println("Name:");
                    String newName = sc.nextLine();
                    System.out.println("Origin:");
                    String newOrigin = sc.nextLine();
                    System.out.println("Type:");
                    String newType = sc.nextLine();
                    System.out.println("Price:");
                    int newPrice = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Number of page:");
                    int newSoTrang = sc.nextInt();
                    sc.nextLine();
                    book newBook = new book(newName, newOrigin, newType, newPrice, newSoTrang);
                    bookManagement.updateBook(nameUpdateBook, newBook);
                    }else{
                        System.out.println("Book not found");
                    }
                    break;
                case 5:
                    ArrayList<String> types = bookManagement.filterBook();
                    for (int i = 0; i < types.size; i++) {
                        System.out.println(types.get(i));
                    }
                case 0:
                    return;
            }
        }
    }
    
}
