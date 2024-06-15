class Book {
     private String authorName;

    public Book(String authorName) {
        this.authorName = authorName;
    }

 public void displayPublication(){
        System.out.println("Author:"+authorName);
 
    }
}

class BookPublication extends Book {
    private String title;

    public BookPublication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }

    @Override
    public void displayPublication() {
        super.displayPublication();
        System.out.println("Book Title:"+title);
    }
}

class PaperPublication extends Book {
    private String title;

    public PaperPublication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }

    @Override
    public void displayPublication() {
        super.displayPublication();
        System.out.println("Paper Title:"+title);
    }
}

public class PublicationDemo {
    public static void main(String[] args) {
        if (args.length < 4 || args.length % 2 != 0) {
            System.out.println("Usage: java PublicationDemo <author_name1> <publication_type1> <title1> <author_name2> <publication_type2> <title2> ...");
            return;
        }

        for (int i = 0; i < args.length; i += 3) {
            String authorName = args[i];
            String publicationType = args[i + 1];
            String title = args[i + 2];

            Book publication;
            if (publicationType.equalsIgnoreCase("book")) {
                publication = new BookPublication(authorName, title);
            } else if (publicationType.equalsIgnoreCase("paper")) {
                publication = new PaperPublication(authorName, title);
            } else {
                System.out.println("Invalid publication type:"+publicationType);
                continue;
            }

            publication.displayPublication();
        }
    }
}
