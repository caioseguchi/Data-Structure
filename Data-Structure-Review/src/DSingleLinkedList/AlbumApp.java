package DSingleLinkedList;

import javax.swing.*;
import java.sql.Date;
import java.time.LocalDate;

public class AlbumApp {
    public static void main(String[] args) {
        // Create a new singly linked list for Albums
        SLLImplement<Album> albumList = new SLLImplement<>();

        while (true) {
            // Menu options
            String[] options = {"Add Album", "Remove Album", "View Album", "Print All Albums", "Exit"};
            int choice = JOptionPane.showOptionDialog(null, "Choose an option", "Album Management",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0:
                    // Add Album
                    String albumIdStr = JOptionPane.showInputDialog("Enter Album ID:");
                    String artistIdStr = JOptionPane.showInputDialog("Enter Artist ID:");
                    String name = JOptionPane.showInputDialog("Enter Album Name:");
                    String releaseDateStr = JOptionPane.showInputDialog("Enter Release Date (YYYY-MM-DD):");

                    int albumId = Integer.parseInt(albumIdStr);
                    int artistId = Integer.parseInt(artistIdStr);
                    Date releaseDate = Date.valueOf(LocalDate.parse(releaseDateStr));

                    Album newAlbum = new Album(albumId, artistId, name, releaseDate);
                    albumList.add(newAlbum);
                    break;

                case 1:
                    // Remove Album
                    String removeIndexStr = JOptionPane.showInputDialog("Enter position to remove:");

                    int removeIndex = Integer.parseInt(removeIndexStr);
                    albumList.remove(removeIndex);
                    break;

                case 2:
                    // View Album
                    String viewIndexStr = JOptionPane.showInputDialog("Enter position to view:");
                    int viewIndex = Integer.parseInt(viewIndexStr);
                    Album album = albumList.get(viewIndex);
                    JOptionPane.showMessageDialog(null, album.toString());
                    break;

                case 3:
                    // Print All Albums
                    StringBuilder allAlbums = new StringBuilder();
                    for (int i = 1; i <= albumList.size(); i++) {
                        allAlbums.append(albumList.get(i).toString()).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, allAlbums.toString());
                    break;

                case 4:
                    // Exit
                    System.exit(0);

                default:
                    break;
            }
        }
    }//main
}//class
