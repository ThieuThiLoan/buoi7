/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi7;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class bookManagement {
    ArrayList<book> library = new ArrayList<>();
    ArrayList<String> type = new ArrayList<>();
    public void showLib() {
        for (int i = 0; i < library.size(); i++) {
            System.out.println(library.get(i).toString());
        }
    }
    
    public boolean addBook(book book) {
        try {
            library.add(book);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean updateBook(String bookName) {
        int indexOfBook = -1;
        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).getName().equals(bookName)) {
            }
        }
        if (indexOfBook == -1) {
            return false;
        } else {
            library.set(indexOfBook, newBook);
            return true;
        }
    }

    public int deleteBook(String nameBook) { //1: Thanh coong, -1: Xoa that bai, 0: Khong tim dc
        book book = new book();
        boolean isBookExist = false;
        for (int i = 0; i < library.size(); i++) {
            if(library.get(i).getName().equals(nameBook)){
        }
    }
    if (isBookExist){
        boolean response = library.remove(book);
        if (response) {
            return 1;
        } else {
            return -1;
        }else {
            return 0;
            }
    }
    }
    public boolean isExistBook(String nameOfBook){
        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).getName.equals(nameOfBook))) {
                return true;
            }
        }
        return false;   
        }
    
    public ArrayList<String> filterBook(){
        for (int i = 0; i < library.size; i++) {
            int type = library.get(i).getType();
            String currentBookType = library.get(i).getType();
            boolean isNewType = true;
            for (int j = 0; j < type.size; j++) {
                if (currentBookType.equals(type.get(i))) {
                    isNewType = false;
                }
            }
            if (isNewType){
            type.add(currentBookType);    
        }
        return type;
    }
    }
}

    
    

