package jspAndJstlSolution;

import java.util.ArrayList;

public class BeanTest {

    public static void main(String[] args) {
        // Instantiate an Album object
        Album album = new Album();
        album.setTitle("Abbey Road");
        album.setArtist("The Beatles");
        album.setYear(1969);

        // Instantiate an Author object
        Author author = new Author();
        author.setName("Mark Twain");
        author.setBirthYear(1835);
        author.setDeathYear(1910);

        // Instantiate a Quote object with an Author property
        Quote quote1 = new Quote();
        quote1.setContent("The secret of getting ahead is getting started.");
        quote1.setAuthor(author);

        // Instantiate another Quote object with the same Author property
        Quote quote2 = new Quote();
        quote2.setContent("The man who does not read good books has no advantage over the man who cannot read them.");
        quote2.setAuthor(author);

        // Store the Quote objects in an ArrayList
        ArrayList<Quote> quotes = new ArrayList<Quote>();
        quotes.add(quote1);
        quotes.add(quote2);

        // Iterate over the ArrayList and print out the content
        for (Quote quote : quotes) {
            System.out.println(quote.getContent() + " - " + quote.getAuthor().getName());
        }
    }

    public static ArrayList<Quote> getQuotes() {
        // Instantiate an Author object
        Author author = new Author();
        author.setName("Mark Twain");
        author.setBirthYear(1835);
        author.setDeathYear(1910);

        // Instantiate a Quote object
        Quote quote1 = new Quote();
        quote1.setContent("The secret of getting ahead is getting started.");
        quote1.setAuthor(author);

        // Instantiate another Quote object with the same Author property
        Quote quote2 = new Quote();
        quote2.setContent("The man who does not read good books has no advantage over the man who cannot read them.");
        quote2.setAuthor(author);

        // Store the Quote objects in an ArrayList
        ArrayList<Quote> quotes = new ArrayList<Quote>();
        quotes.add(quote1);
        quotes.add(quote2);

        // Return the ArrayList of quotes
        return quotes;
    }
}
