import java.util.LinkedList;

class Main {
    public static void main(String[] args) {

        LinkedList<String> Playlist = new LinkedList<>();

        Playlist.add("Wanted u");
        Playlist.add("Out of Time");
        Playlist.add("Sanctuary");
        Playlist.add("Hope");
        Playlist.add("As it was");
        Playlist.add("LOVE");
        Playlist.add("Never Not");
        Playlist.add("That's Hilarious");
        Playlist.add("Nitrous");

        Playlist.addFirst("Save your tears");

        Playlist.addLast("Like You Do");

        System.out.println(Playlist.get(0));

        Playlist.set(4, "Normal People");

        Playlist.remove(0);

        System.out.println("Updated playlist: " + Playlist);
    }
}
