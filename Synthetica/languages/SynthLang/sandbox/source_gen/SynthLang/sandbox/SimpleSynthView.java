package SynthLang.sandbox;

/*Generated by MPS */

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.ImageIcon;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.JPanel;
import com.jsyn.swing.ExponentialRangeModel;
import com.jsyn.swing.PortModelFactory;
import com.jsyn.swing.RotaryTextController;
import java.awt.BorderLayout;
import com.jsyn.swing.DoubleBoundedRangeSlider;
import com.jsyn.swing.PortControllerFactory;
import javax.swing.SwingConstants;
import java.awt.Font;

public class SimpleSynthView extends JFrame {
  /**
   * JFrame is serializable
   */
  private static final long serialVersionUID = -6105870759333444690L;

  private SimpleSynthController controller;

  {
    try {
      for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (Exception e) {
      // keep default LookAndFeel 
    }
  }

  public SimpleSynthView(SimpleSynthController ctl) {
    controller = ctl;
    init();
  }

  private void init() {
    setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
    setIconImage(new ImageIcon("icon.png").getImage());
    setTitle("Simple Synth");
    setSize(800, 450);
    setResizable(true);

    // set up the layout manager and constraints 
    GridBagLayout gbl = new GridBagLayout();
    gbl.columnWeights = new double[3];
    for (int i = 0; i < gbl.columnWeights.length; ++i) {
      gbl.columnWeights[i] = 1.0;
    }
    gbl.rowWeights = new double[1];
    for (int i = 0; i < gbl.rowWeights.length; ++i) {
      gbl.rowWeights[i] = 1.0;
    }
    setLayout(gbl);

    GridBagConstraints c = new GridBagConstraints();
    c.fill = GridBagConstraints.BOTH;
    c.gridx = 2;
    c.gridy = 0;
    // add a fake element at the right lower edge,  
    // to prevent the panel from becoming smaller than required 
    this.add(new JLabel(""), c);

    {
      // create sub-panel 
      JPanel subPanel_a0 = new JPanel();

      // set up the layout manager and constraints 
      GridBagLayout gbl_a0 = new GridBagLayout();
      gbl_a0.columnWeights = new double[1];
      for (int i = 0; i < gbl_a0.columnWeights.length; ++i) {
        gbl_a0.columnWeights[i] = 1.0;
      }
      gbl_a0.rowWeights = new double[3];
      subPanel_a0.setLayout(gbl_a0);
      for (int i = 0; i < gbl_a0.rowWeights.length; ++i) {
        gbl_a0.rowWeights[i] = 1.0;
      }
      subPanel_a0.setLayout(gbl_a0);

      c.fill = GridBagConstraints.BOTH;
      c.gridx = 0;
      c.gridy = 2;
      // add a fake element at the right lower edge,  
      // to prevent the panel from becoming smaller than required 
      subPanel_a0.add(new JLabel(""), c);

      {
        ExponentialRangeModel knobInputModel_a0a = PortModelFactory.createExponentialModel(controller.getModel().getInputPortByName("sound_sine1", "amplitude"));
        RotaryTextController knob_a0a = new RotaryTextController(knobInputModel_a0a, 5);
        knob_a0a.setTitle("Volume 1");

        // create sub-panel which holds only the knob (make it resizeable) 
        JPanel knobPanel_a0a = new JPanel();
        knobPanel_a0a.setLayout(new BorderLayout());
        knobPanel_a0a.add(knob_a0a, BorderLayout.CENTER);
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        subPanel_a0.add(knobPanel_a0a, c);
      }
      {
        DoubleBoundedRangeSlider slider_b0a = PortControllerFactory.createExponentialPortSlider(controller.getModel().getInputPortByName("sound_sine1", "frequency"));
        slider_b0a.setOrientation(SwingConstants.HORIZONTAL);

        // create sub-panel which holds the slider and its label (make it resizeable) 
        JPanel sliderPanel_b0a = new JPanel();
        sliderPanel_b0a.setLayout(new BorderLayout());
        JLabel sliderLabel_b0a = new JLabel("Frequency 1", SwingConstants.CENTER);
        sliderLabel_b0a.setFont(sliderLabel_b0a.getFont().deriveFont(Font.BOLD));
        sliderPanel_b0a.add(sliderLabel_b0a, BorderLayout.PAGE_START);
        sliderPanel_b0a.add(slider_b0a, BorderLayout.CENTER);
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        c.gridheight = 1;
        subPanel_a0.add(sliderPanel_b0a, c);
      }
      {
        ExponentialRangeModel knobInputModel_c0a = PortModelFactory.createExponentialModel(controller.getModel().getInputPortByName("sound_sine2", "amplitude"));
        RotaryTextController knob_c0a = new RotaryTextController(knobInputModel_c0a, 5);
        knob_c0a.setTitle("Volume 2");

        // create sub-panel which holds only the knob (make it resizeable) 
        JPanel knobPanel_c0a = new JPanel();
        knobPanel_c0a.setLayout(new BorderLayout());
        knobPanel_c0a.add(knob_c0a, BorderLayout.CENTER);
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 1;
        c.gridheight = 1;
        subPanel_a0.add(knobPanel_c0a, c);
      }

      c.gridx = 0;
      c.gridy = 0;
      c.gridwidth = 1;
      c.gridheight = 1;
      this.add(subPanel_a0, c);
    }
    System.err.println("WARNING: Button " + "ON" + " not generated");
    System.err.println("WARNING: Button " + "OFF" + " not generated");
    {
      // create sub-panel 
      JPanel subPanel_d0 = new JPanel();

      // set up the layout manager and constraints 
      GridBagLayout gbl_d0 = new GridBagLayout();
      gbl_d0.columnWeights = new double[1];
      for (int i = 0; i < gbl_d0.columnWeights.length; ++i) {
        gbl_d0.columnWeights[i] = 1.0;
      }
      gbl_d0.rowWeights = new double[3];
      subPanel_d0.setLayout(gbl_d0);
      for (int i = 0; i < gbl_d0.rowWeights.length; ++i) {
        gbl_d0.rowWeights[i] = 1.0;
      }
      subPanel_d0.setLayout(gbl_d0);

      c.fill = GridBagConstraints.BOTH;
      c.gridx = 0;
      c.gridy = 2;
      // add a fake element at the right lower edge,  
      // to prevent the panel from becoming smaller than required 
      subPanel_d0.add(new JLabel(""), c);

      {
        DoubleBoundedRangeSlider slider_a3a = PortControllerFactory.createExponentialPortSlider(controller.getModel().getInputPortByName("sound_sine2", "frequency"));
        slider_a3a.setOrientation(SwingConstants.VERTICAL);

        // create sub-panel which holds the slider and its label (make it resizeable) 
        JPanel sliderPanel_a3a = new JPanel();
        sliderPanel_a3a.setLayout(new BorderLayout());
        JLabel sliderLabel_a3a = new JLabel("Frequency 2", SwingConstants.CENTER);
        sliderLabel_a3a.setFont(sliderLabel_a3a.getFont().deriveFont(Font.BOLD));
        sliderPanel_a3a.add(sliderLabel_a3a, BorderLayout.PAGE_START);
        sliderPanel_a3a.add(slider_a3a, BorderLayout.CENTER);
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 2;
        subPanel_d0.add(sliderPanel_a3a, c);
      }
      {
        ExponentialRangeModel knobInputModel_b3a = PortModelFactory.createExponentialModel(controller.getModel().getInputPortByName("sound_saw", "frequency"));
        RotaryTextController knob_b3a = new RotaryTextController(knobInputModel_b3a, 5);
        knob_b3a.setTitle("Wobble");

        // create sub-panel which holds only the knob (make it resizeable) 
        JPanel knobPanel_b3a = new JPanel();
        knobPanel_b3a.setLayout(new BorderLayout());
        knobPanel_b3a.add(knob_b3a, BorderLayout.CENTER);
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 1;
        c.gridheight = 1;
        subPanel_d0.add(knobPanel_b3a, c);
      }

      c.gridx = 1;
      c.gridy = 0;
      c.gridwidth = 1;
      c.gridheight = 1;
      this.add(subPanel_d0, c);
    }
    {
      // create sub-panel 
      JPanel subPanel_e0 = new JPanel();

      // set up the layout manager and constraints 
      GridBagLayout gbl_e0 = new GridBagLayout();
      gbl_e0.columnWeights = new double[1];
      for (int i = 0; i < gbl_e0.columnWeights.length; ++i) {
        gbl_e0.columnWeights[i] = 1.0;
      }
      gbl_e0.rowWeights = new double[3];
      subPanel_e0.setLayout(gbl_e0);
      for (int i = 0; i < gbl_e0.rowWeights.length; ++i) {
        gbl_e0.rowWeights[i] = 1.0;
      }
      subPanel_e0.setLayout(gbl_e0);

      c.fill = GridBagConstraints.BOTH;
      c.gridx = 0;
      c.gridy = 2;
      // add a fake element at the right lower edge,  
      // to prevent the panel from becoming smaller than required 
      subPanel_e0.add(new JLabel(""), c);

      {
        ExponentialRangeModel knobInputModel_a4a = PortModelFactory.createExponentialModel(controller.getModel().getInputPortByName("sound_saw", "amplitude"));
        RotaryTextController knob_a4a = new RotaryTextController(knobInputModel_a4a, 5);
        knob_a4a.setTitle("Beat");

        // create sub-panel which holds only the knob (make it resizeable) 
        JPanel knobPanel_a4a = new JPanel();
        knobPanel_a4a.setLayout(new BorderLayout());
        knobPanel_a4a.add(knob_a4a, BorderLayout.CENTER);
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        subPanel_e0.add(knobPanel_a4a, c);
      }
      {
        ExponentialRangeModel knobInputModel_b4a = PortModelFactory.createExponentialModel(controller.getModel().getInputPortByName("sound_sine3", "frequency"));
        RotaryTextController knob_b4a = new RotaryTextController(knobInputModel_b4a, 5);
        knob_b4a.setTitle("Boo");

        // create sub-panel which holds only the knob (make it resizeable) 
        JPanel knobPanel_b4a = new JPanel();
        knobPanel_b4a.setLayout(new BorderLayout());
        knobPanel_b4a.add(knob_b4a, BorderLayout.CENTER);
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        c.gridheight = 1;
        subPanel_e0.add(knobPanel_b4a, c);
      }
      {
        ExponentialRangeModel knobInputModel_c4a = PortModelFactory.createExponentialModel(controller.getModel().getInputPortByName("sound_sine3", "amplitude"));
        RotaryTextController knob_c4a = new RotaryTextController(knobInputModel_c4a, 5);
        knob_c4a.setTitle("Bip");

        // create sub-panel which holds only the knob (make it resizeable) 
        JPanel knobPanel_c4a = new JPanel();
        knobPanel_c4a.setLayout(new BorderLayout());
        knobPanel_c4a.add(knob_c4a, BorderLayout.CENTER);
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 1;
        c.gridheight = 1;
        subPanel_e0.add(knobPanel_c4a, c);
      }

      c.gridx = 2;
      c.gridy = 0;
      c.gridwidth = 1;
      c.gridheight = 1;
      this.add(subPanel_e0, c);
    }

    validate();
    setLocationRelativeTo(null);
    setVisible(true);
  }

  /**
   * Get the controller. Usually only the model should need this.
   * 
   * @return the controller
   */
  public SimpleSynthController getController() {
    return controller;
  }

}