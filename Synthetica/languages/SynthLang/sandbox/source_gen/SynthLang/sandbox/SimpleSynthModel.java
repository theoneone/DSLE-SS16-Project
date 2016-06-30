package SynthLang.sandbox;

/*Generated by MPS */

import com.jsyn.Synthesizer;
import com.jsyn.unitgen.UnitOscillator;
import com.jsyn.unitgen.LinearRamp;
import com.jsyn.unitgen.FilterHighPass;
import com.jsyn.unitgen.FilterPeakingEQ;
import com.jsyn.unitgen.LineOut;
import com.jsyn.JSyn;
import com.jsyn.unitgen.SawtoothOscillatorBL;
import com.jsyn.ports.UnitInputPort;
import com.jsyn.ports.UnitPort;
import com.jsyn.unitgen.UnitGenerator;

public class SimpleSynthModel implements ISimpleSynth {

  private Synthesizer synth;
  private UnitOscillator osc;
  private LinearRamp lag;
  private FilterHighPass filter;
  private FilterPeakingEQ filter2;
  private LineOut lineOut;


  /**
   * The Synthesizer
   */
  public SimpleSynthModel() {
    init();
  }


  /**
   * Set up the synthesizer components
   */
  private void init() {
    synth = JSyn.createSynthesizer();
    osc = new SawtoothOscillatorBL();
    lag = new LinearRamp();
    filter = new FilterHighPass();
    filter2 = new FilterPeakingEQ();
    lineOut = new LineOut();
    // Add tone Generator 
    synth.add(osc);
    // Add a lag to smooth out amplitude changes and avoid pops. 
    synth.add(lag);
    synth.add(filter);
    synth.add(filter2);
    // Add output mixer 
    synth.add(lineOut);
    // Connect the Oscillator to the left and right outputs 
    osc.output.connect(filter.input);
    filter.output.connect(filter2.input);
    filter2.output.connect(0, lineOut.input, 0);
    filter2.output.connect(0, lineOut.input, 1);
    // set limits and default for the port 
    lag.output.connect(osc.amplitude);
    lag.input.setup(0.0, 0.2, 1.0);
    lag.time.set(0.2);
    osc.frequency.setup(50.0, 300.0, 10000.0);
    filter.frequency.setup(50.0, 5000.0, 10000.0);
    filter.frequency.setup(50.0, 100.0, 10000.0);
  }

  public void start() {
    synth.start();
    lineOut.start();
  }

  public void stop() {
    if (synth != null) {
      synth.stop();
    }
    if (lineOut != null) {
      lineOut.stop();
    }
  }

  /*package*/ UnitInputPort getInputPortByName(String generator, String portName) {
    try {
      Object o = this.getClass().getDeclaredField(generator).get(this);
      UnitPort port = ((UnitGenerator) o).getPortByName(portName);
      return (UnitInputPort) port;
    } catch (Exception e) {
      e.printStackTrace();
      // no such field --> null 
    }
    return null;
  }
}
