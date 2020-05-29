package org.example.load;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.formats.OBODocumentFormat;
import org.semanticweb.owlapi.io.FileDocumentSource;

import java.io.File;

/**
 * @author Josef Hardi <josef.hardi@stanford.edu> <br>
 * Stanford Center for Biomedical Informatics Research
 */
public class OboOntologyFileLoader {

  public static void main(String[] args) throws Exception {

    var inputPath = "/path/to/file";
    var documentSource = new FileDocumentSource(
        new File(inputPath),
        new OBODocumentFormat());
    var man = OWLManager.createOWLOntologyManager();
    var ont = man.loadOntologyFromOntologyDocument(documentSource);

    System.out.println(ont.toString());
  }
}
