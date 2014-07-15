import java.util.ArrayList;

/**
 * A class to maintain an arbitrarily long list of notes.
 * Notes are numbered for external reference by a human user.
 * In this version, note numbers start at 0.
 * 
 * @author David J. Barnes and Michael Kolling.
 * @version 2008.03.30
 */
public class Notebook
{
    // Storage for an arbitrary number of notes.
    private ArrayList<String> notes;

    /**
     * Perform any initialization that is required for the
     * notebook.
     */
    public Notebook()
    {
        notes = new ArrayList<String>();
    }

    /**
     * Store a new note into the notebook.
     * @param note The note to be stored.
     */
    public void storeNote(String note)
    {
        notes.add(note);
    }

    /**
     * @return The number of notes currently in the notebook.
     */
    public int numberOfNotes()
    {
        return notes.size();
    }

    /**
     * Show a note.
     * @param noteNumber The number of the note to be shown.
     */
    public void showNote(int noteNumber)
    {
        if(noteNumber < 0) 
        {
            // This is not a valid note number, so do nothing.
            System.out.println("Please enter a number that is greater than or equal to 0");
        }
        else if(noteNumber < numberOfNotes()) 
        {
            // This is a valid note number, so we can print it.
            System.out.println(notes.get(noteNumber));
        }
        else 
        {
            // This is not a valid note number, so do nothing.
            System.out.println("There is no note at this index number");
        }
    }
    
    /**
     * Remove a note.
     * @param noteNumber The number of the note to be removed.
     */
    public void removeNote(int noteNumber)
    {
        if(noteNumber < 0) 
        {
            // This is not a valid note number, so do nothing.
            System.out.println("Please enter a number that is greater than or equal to 0");
        }
        else if(noteNumber < numberOfNotes()) 
        {
            // This is a valid note number, so we can remove it.
            notes.remove(noteNumber);
        }
        else 
        {
            // This is not a valid note number, so do nothing.
            System.out.println("There is no note at this index number");
        }
    }
    
    /**
     * Print out each note.
     */
    public void listNotes()
    {
        for(String note : notes)
        {
            System.out.println(note);
        }
    }
}
