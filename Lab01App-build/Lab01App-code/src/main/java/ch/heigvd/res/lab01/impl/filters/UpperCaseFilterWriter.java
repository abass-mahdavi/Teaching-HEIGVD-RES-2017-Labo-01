package ch.heigvd.res.lab01.impl.filters;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

/**
 *
 * @author Olivier Liechti
 * modified by Abass Mahdavi 
 */
public class UpperCaseFilterWriter extends FilterWriter {
  
  public UpperCaseFilterWriter(Writer wrappedWriter) {
    super(wrappedWriter);
  }

  @Override
  public void write(String str, int off, int len) throws IOException {
      str = str.toUpperCase();
      super.write(str, off, len);
  }

  @Override
  public void write(char[] cbuf, int off, int len) throws IOException {
      for (int i = 0; i < cbuf.length ; i++){
          cbuf[i] =  Character.toUpperCase(cbuf[i]);
      }
    super.write(cbuf, off, len);
  }

  @Override
  public void write(int c) throws IOException {
    if (c >= (int)'a' & c <= (int)'z'){
        c = c + (int)'A' - (int)'a';
    }
    super.write(c);
  }
}
