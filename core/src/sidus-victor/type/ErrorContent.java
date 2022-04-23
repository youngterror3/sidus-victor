package sidus-victor.type;

import sidus-victor.ctype.*;

/** Represents a blank type of content that has an error. Replaces anything that failed to parse. */
public class ErrorContent extends Content{
    @Override
    public ContentType getContentType(){
        return ContentType.error;
    }
}
