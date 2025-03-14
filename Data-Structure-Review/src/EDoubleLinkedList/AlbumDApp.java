package EDoubleLinkedList;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class AlbumDApp {
    public static void main(String[] args) {
        DLLImplements<Album> albumList = new DLLImplements<>();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try {
            // Adding albums to the list
            Album album1 = new Album(1, 101, "Album One", sdf.parse("2023-01-01"));
            Album album2 = new Album(2, 102, "Album Two", sdf.parse("2023-02-01"));
            Album album3 = new Album(3, 103, "Album Three", sdf.parse("2023-03-01"));
            albumList.add(album1);
            albumList.add(album2);
            albumList.add(album3);
            System.out.println("Initial list: " + albumList);

            // Adding before
            Album albumBeforeTwo = new Album(4, 104, "Album Before Two", sdf.parse("2023-04-01"));
            albumList.addBefore(album2, albumBeforeTwo);
            System.out.println("After adding 'Album Before Two' before 'Album Two': " + albumList);

            // Adding after
            Album albumAfterTwo = new Album(5, 105, "Album After Two", sdf.parse("2023-05-01"));
            albumList.addAfter(album2, albumAfterTwo);
            System.out.println("After adding 'Album After Two' after 'Album Two': " + albumList);

            // Removing an album
            albumList.remove(album2);
            System.out.println("After removing 'Album Two': " + albumList);

            // Trying to remove an album not in the list
            try {
                albumList.remove(new Album(6, 106, "Album Four", sdf.parse("2023-06-01")));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            // Adding before the first album
            Album albumBeforeOne = new Album(7, 107, "Album Before One", sdf.parse("2023-07-01"));
            albumList.addBefore(album1, albumBeforeOne);
            System.out.println("After adding 'Album Before One' before 'Album One': " + albumList);

            // Adding after the last album
            Album albumAfterThree = new Album(8, 108, "Album After Three", sdf.parse("2023-08-01"));
            albumList.addAfter(album3, albumAfterThree);
            System.out.println("After adding 'Album After Three' after 'Album Three': " + albumList);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
