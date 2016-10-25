package ch.ibw.exceptions;

import Prog1Tools.IOTools;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LiesAusDatei_3 {

  /**
   * Prüfen Zeichen zwischen 0 oder 9
   * @param z
   * @throws DigitalException
   */
  public static void check(int z) throws DigitalException {
    if(z >='0' && z <= '9') {
      DigitalException de = new DigitalException();
      throw de;
    }
  }

  public static void main(String[] args)
  {

    try {
      // Lies den Dateinamen ein:
      String dateiname = IOTools.readString("Dateiname: ");
      // Oeffne die Datei zum Lesen:
      FileReader dateileser = new FileReader(dateiname);
      // Lies alle Zeichen aus der Datei ein (read liefert int)
      // bis das Dateiende erreicht wird (signalisiert durch -1)
      // und gib sie (wieder als Buchstabe) auf den Bildschirm aus:
      System.out.println("In der Datei " + dateiname + " steht");
      while (true) {
        int gelesen = dateileser.read();
        if (gelesen == -1)
          break;
        check(gelesen);
        System.out.print((char) gelesen);
      }

    } catch (FileNotFoundException e) {
      System.out.println("FileNotFoundException Fehler: "+e.getMessage());
    } catch(IOException e) {
      System.out.println("IOException Fehler: "+e.getMessage());
    } catch(DigitalException e) {
      System.out.println("DigitalException Fehler: "+e.getMessage());
    }
  }
}
