package sidus-victor.ctype;

/** Interface for a list of content to be loaded in {@link sidus-victor.core.ContentLoader}. */
public interface ContentList{
    /** This method should create all the content. */
    void load();
}
