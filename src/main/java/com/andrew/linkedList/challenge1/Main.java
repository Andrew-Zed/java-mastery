package com.andrew.linkedList.challenge1;

import java.util.*;


public class Main {

    private static final ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

        Album album = new Album("Face 2 Face", "Two Face");
        album.addSong("Ole", 4.50);
        album.addSong("Holy", 0.16);
        album.addSong("African Queen", 4.21);
        album.addSong("Nfana Ibaga (No Problem)", 4.25);
        album.addSong("Right here", 4.47);
        album.addSong("U No Holy Pass", 4.55);
        album.addSong("Police (Skit)", 0.25);
        album.addSong("Keep On rocking", 5.43);
        album.addSong("Thank U Lord", 4.25);
        album.addSong("Odi Ya Featuring BlackFace", 4.38);
        album.addSong("Right Here (Mkd Remix)", 4.29);
        album.addSong("U No Holy Pass (Mkd Remix)", 4.50);
        album.addSong("African Queen (Mkd Remix)", 4.29);
        album.addSong("Keep On Rocking (Mkd Remix)", 6.07);
        album.addSong("African Queen (Jazz Version)", 4.51);
        albums.add(album);

        album = new Album("Love, Damini", "Burna Boy");
        album.addSong("Glory", 3.52);
        album.addSong("Science", 3.22);
        album.addSong("Cloak & Dagger", 3.32);
        album.addSong("Kilometre", 2.33);
        album.addSong("Jegele", 3.03);
        album.addSong("Whiskey", 3.24);
        album.addSong("Last Last", 2.24);
        album.addSong("Different Size", 3.30);
        album.addSong("It's Plenty", 3.37);
        album.addSong("Dirty Secrets", 2.32);
        album.addSong("Tonny-Ann Singh", 2.56);
        album.addSong("Solid", 3.16);
        album.addSong("For My Hand", 2.40);
        album.addSong("Rollercoaster", 3.08);
        album.addSong("Vanilla", 2.36);
        album.addSong("Glory", 3.52);
        album.addSong("Common Person", 3.31);
        album.addSong("Wild Dreams", 3.07);
        album.addSong("How Bad Could it Be", 4.58);
        album.addSong("Love Damini", 2.23);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addToPlayList("Ole", playList);
        albums.get(0).addToPlayList("Holy", playList);
        albums.get(0).addToPlayList("Thank U Lord", playList);
        albums.get(0).addToPlayList("We are here", playList); // Does not exist
        albums.get(0).addToPlayList(13, playList);

        albums.get(1).addToPlayList(10, playList);
        albums.get(1).addToPlayList(5, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(15, playList);
        albums.get(1).addToPlayList(25, playList); // There is no track 25

        play(playList);
    }


    private  static  void  play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0) {
            System.out.println("No Song in the playlist");
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case  0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if(!forward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                        break;
                case 2:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if(listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size() > 0) {
                        listIterator.remove();
                        if(listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if(listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                                        "1 - to play next song\n" +
                                        "2 - to play the previous song\n" +
                                        "3 - to replay the current song\n" +
                                        "4 - list songs in the playlist\n" +
                                        "5 - print available actions.\n" +
                                        "6 - delete current song from playlist");
    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("==========================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString() );
        }
        System.out.println("==========================");
    }

}
