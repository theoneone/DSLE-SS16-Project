package SynthLang.sandbox;

/*Generated by MPS */

import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class SyntheticaController implements ActionListener {

  private SyntheticaView syntheticaFrame = new SyntheticaView();

  public SyntheticaController() {
    syntheticaFrame.addFrameWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent evt) {
        exitProgram();
      }
    });

    syntheticaFrame.synth.start();
    syntheticaFrame.lineOut.start();
  }

  @Override
  public void actionPerformed(ActionEvent event) {
    // no action 
  }

  private void exitProgram() {
    if (syntheticaFrame.synth != null) {
      syntheticaFrame.synth.stop();
    }
    if (syntheticaFrame.lineOut != null) {
      syntheticaFrame.lineOut.stop();
    }
    System.exit(0);
  }
}
