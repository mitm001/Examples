/*
 * $Id$
 * 
 * Copyright (c) 2016, Simsilica, LLC
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions 
 * are met:
 * 
 * 1. Redistributions of source code must retain the above copyright 
 *    notice, this list of conditions and the following disclaimer.
 * 
 * 2. Redistributions in binary form must reproduce the above copyright 
 *    notice, this list of conditions and the following disclaimer in 
 *    the documentation and/or other materials provided with the 
 *    distribution.
 * 
 * 3. Neither the name of the copyright holder nor the names of its 
 *    contributors may be used to endorse or promote products derived 
 *    from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS 
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT 
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS 
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE 
 * COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES 
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR 
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) 
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, 
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED 
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package example;

import com.jme3.app.*;
import com.jme3.app.state.ScreenshotAppState;
import com.jme3.math.ColorRGBA;
import com.jme3.material.Material;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.scene.Spatial;
import com.jme3.scene.shape.Box;
import com.jme3.texture.Texture;

import com.simsilica.lemur.GuiGlobals;
import com.simsilica.lemur.OptionPanelState;
import com.simsilica.lemur.anim.AnimationState;
import com.simsilica.lemur.style.BaseStyles;

/**
 *  The main bootstrap class for the SimEthereal networking example
 *  game. 
 *
 *  @author    Paul Speed
 */
public class Main extends SimpleApplication {

    private Node logo;

    public static void main( String... args ) {
        System.out.println("SimEthereal Example");
        
        Main main = new Main();
        main.start();
    }

    public Main() {
        super(new StatsAppState(), new DebugKeysAppState(), new BasicProfilerState(false),
              new AnimationState(), // from Lemur
              new OptionPanelState(), // from Lemur
              new SiliconDioxideState(),
              new MainMenuState(),
              new ScreenshotAppState("", System.currentTimeMillis())); 
    }
        
    public void simpleInitApp() {        
        
        setPauseOnLostFocus(false);
        //setDisplayFps(false);
        //setDisplayStatView(false);
        
        GuiGlobals.initialize(this);
 
        GuiGlobals globals = GuiGlobals.getInstance();
        BaseStyles.loadGlassStyle();
        globals.getStyles().setDefaultStyle("glass");
        
        // Just load a sample object for the background for now
        /*logo = new Node("LogoHolder");
        Spatial molecule = assetManager.loadModel("Models/simsilica.j3o");
        molecule.center();
        logo.attachChild(molecule);
        logo.setLocalScale(0.5f);
        rootNode.attachChild(logo);
        
    }
    
    public void simpleUpdate( float tpf ) {
        logo.rotate(0, tpf, 0);*/
    }
}

