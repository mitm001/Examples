/*
 * $Id$
 * 
 * Copyright (c) 2019, Simsilica, LLC
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

package sigem.view;

import com.jme3.input.KeyInput;
import com.simsilica.lemur.input.Axis;
import com.simsilica.lemur.input.Button;
import com.simsilica.lemur.input.FunctionId;
import com.simsilica.lemur.input.InputDevice;
import com.simsilica.lemur.input.InputMapper;
import com.simsilica.lemur.input.InputState;


/**
 *  Defines a set of global game functions and some default key/control
 *  mappings.
 *
 *  @author    Paul Speed
 */
public class PlayerMovementFunctions {

    public static final String IN_GAME = "In Game";
    public static final FunctionId F_P1_THRUST = new FunctionId(IN_GAME, "P1 Thrust");   
    public static final FunctionId F_P1_TURN = new FunctionId(IN_GAME, "P1 Turn");
    public static final FunctionId F_P1_SHOOT_MAIN = new FunctionId(IN_GAME, "P1 Shoot");    

    public static final FunctionId F_P2_THRUST = new FunctionId(IN_GAME, "P2 Thrust");   
    public static final FunctionId F_P2_TURN = new FunctionId(IN_GAME, "P2 Turn");
    public static final FunctionId F_P2_SHOOT_MAIN = new FunctionId(IN_GAME, "P2 Shoot");    
    
    public static void initializeDefaultMappings( InputMapper inputMapper ) {
 
        InputDevice joy1 = InputDevice.JOYSTICK1;         
        inputMapper.map(F_P1_THRUST, KeyInput.KEY_W);
        // The joystick Y axes are backwards on game pads... forward
        // is negative.  So we'll flip it over in the mapping.
        inputMapper.map(F_P1_THRUST, InputState.Negative, joy1.axis(Axis.JOYSTICK_LEFT_Y));
        
        inputMapper.map(F_P1_TURN, KeyInput.KEY_D);
        inputMapper.map(F_P1_TURN, InputState.Negative, KeyInput.KEY_A);
        inputMapper.map(F_P1_TURN, joy1.axis(Axis.JOYSTICK_LEFT_X));
        
        inputMapper.map(F_P1_SHOOT_MAIN, KeyInput.KEY_SPACE); 
        inputMapper.map(F_P1_SHOOT_MAIN, joy1.button(Button.JOYSTICK_BUTTON1));
         
        InputDevice joy2 = InputDevice.JOYSTICK2;         
        // The joystick Y axes are backwards on game pads... forward
        // is negative.  So we'll flip it over in the mapping.
        inputMapper.map(F_P2_THRUST, InputState.Negative, joy2.axis(Axis.JOYSTICK_LEFT_Y));        
        inputMapper.map(F_P2_TURN, joy2.axis(Axis.JOYSTICK_LEFT_X));
        inputMapper.map(F_P2_SHOOT_MAIN, joy2.button(Button.JOYSTICK_BUTTON1)); 
    }
}


