class MovieNode {
    String title;
    String director;
    int year;
    double rating;
    MovieNode prev;
    MovieNode next;

    MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }
}

public class MovieManagementSystem {

    private MovieNode head;
    private MovieNode tail;

    public void addFirst(String title, String director, int year, double rating) {
        MovieNode node = new MovieNode(title, director, year, rating);
        if (head == null) {
            head = tail = node;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
    }

    public void addLast(String title, String director, int year, double rating) {
        MovieNode node = new MovieNode(title, director, year, rating);
        if (head == null) {
            head = tail = node;
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    public void addAtPosition(int position, String title, String director, int year, double rating) {
        if (position <= 1 || head == null) {
            addFirst(title, director, year, rating);
            return;
        }

        MovieNode temp = head;
        int count = 1;

        while (temp.next != null && count < position - 1) {
            temp = temp.next;
            count++;
        }

        if (temp.next == null) {
            addLast(title, director, year, rating);
            return;
        }

        MovieNode node = new MovieNode(title, director, year, rating);
        node.next = temp.next;
        node.prev = temp;
        temp.next.prev = node;
        temp.next = node;
    }

    public void removeByTitle(String title) {
        MovieNode temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                if (temp == head && temp == tail) {
                    head = tail = null;
                } else if (temp == head) {
                    head = head.next;
                    head.prev = null;
                } else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                return;
            }
            temp = temp.next;
        }
    }

    public void searchByDirector(String director) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                System.out.println(temp.title + " " + temp.year + " " + temp.rating);
            }
            temp = temp.next;
        }
    }

    public void searchByRating(double rating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.rating == rating) {
                System.out.println(temp.title + " " + temp.director + " " + temp.year);
            }
            temp = temp.next;
        }
    }

    public void displayForward() {
        MovieNode temp = head;
        while (temp != null) {
            System.out.println(temp.title + " " + temp.director + " " + temp.year + " " + temp.rating);
            temp = temp.next;
        }
    }

    public void displayReverse() {
        MovieNode temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " " + temp.director + " " + temp.year + " " + temp.rating);
            temp = temp.prev;
        }
    }

    public void updateRating(String title, double newRating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                return;
            }
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        MovieManagementSystem m = new MovieManagementSystem();
        m.addFirst("Inception", "Nolan", 2010, 8.8);
        m.addLast("Interstellar", "Nolan", 2014, 8.6);
        m.addAtPosition(2, "Avatar", "Cameron", 2009, 7.9);
        m.displayForward();
        m.updateRating("Avatar", 8.1);
        m.removeByTitle("Inception");
        m.displayReverse();
    }
}
