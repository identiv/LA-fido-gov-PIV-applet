/******************************************************************************
 * MIT License
 *
 * Project: OpenFIPS201
 * Copyright: (c) 2017 Commonwealth of Australia
 * Author: Kim O'Sullivan - Makina (kim@makina.com.au)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 ******************************************************************************/

package com.makina.security.openfips201;

/**
 * Curve P-256 (aka SECP256R1) domain parameters from NIST SP 800-186
 * (https://nvlpubs.nist.gov/nistpubs/SpecialPublications/NIST.SP.800-186-draft.pdf) para 4.2.1.3
 */
final class ECParamsP256 extends ECParams {

  // Curve polynomial element a
  private static final byte[] a = {
    (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF,
    (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x01,
    (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
    (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
    (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
    (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF,
    (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF,
    (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFC
  };

  // Curve polynomial element b
  private static final byte[] b = {
    (byte) 0x5A, (byte) 0xC6, (byte) 0x35, (byte) 0xD8,
    (byte) 0xAA, (byte) 0x3A, (byte) 0x93, (byte) 0xE7,
    (byte) 0xB3, (byte) 0xEB, (byte) 0xBD, (byte) 0x55,
    (byte) 0x76, (byte) 0x98, (byte) 0x86, (byte) 0xBC,
    (byte) 0x65, (byte) 0x1D, (byte) 0x06, (byte) 0xB0,
    (byte) 0xCC, (byte) 0x53, (byte) 0xB0, (byte) 0xF6,
    (byte) 0x3B, (byte) 0xCE, (byte) 0x3C, (byte) 0x3E,
    (byte) 0x27, (byte) 0xD2, (byte) 0x60, (byte) 0x4B
  };

  // Base point
  private static final byte[] G = {
    (byte) 0x04, (byte) 0x6B, (byte) 0x17, (byte) 0xD1,
    (byte) 0xF2, (byte) 0xE1, (byte) 0x2C, (byte) 0x42,
    (byte) 0x47, (byte) 0xF8, (byte) 0xBC, (byte) 0xE6,
    (byte) 0xE5, (byte) 0x63, (byte) 0xA4, (byte) 0x40,
    (byte) 0xF2, (byte) 0x77, (byte) 0x03, (byte) 0x7D,
    (byte) 0x81, (byte) 0x2D, (byte) 0xEB, (byte) 0x33,
    (byte) 0xA0, (byte) 0xF4, (byte) 0xA1, (byte) 0x39,
    (byte) 0x45, (byte) 0xD8, (byte) 0x98, (byte) 0xC2,
    (byte) 0x96, (byte) 0x4F, (byte) 0xE3, (byte) 0x42,
    (byte) 0xE2, (byte) 0xFE, (byte) 0x1A, (byte) 0x7F,
    (byte) 0x9B, (byte) 0x8E, (byte) 0xE7, (byte) 0xEB,
    (byte) 0x4A, (byte) 0x7C, (byte) 0x0F, (byte) 0x9E,
    (byte) 0x16, (byte) 0x2B, (byte) 0xCE, (byte) 0x33,
    (byte) 0x57, (byte) 0x6B, (byte) 0x31, (byte) 0x5E,
    (byte) 0xCE, (byte) 0xCB, (byte) 0xB6, (byte) 0x40,
    (byte) 0x68, (byte) 0x37, (byte) 0xBF, (byte) 0x51,
    (byte) 0xF5
  };

  // Field definition
  private static final byte[] p = {
    (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF,
    (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x01,
    (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
    (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
    (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
    (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF,
    (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF,
    (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF
  };

  // Order n of G
  private static final byte[] n = {
    (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF,
    (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
    (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF,
    (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF,
    (byte) 0xBC, (byte) 0xE6, (byte) 0xFA, (byte) 0xAD,
    (byte) 0xA7, (byte) 0x17, (byte) 0x9E, (byte) 0x84,
    (byte) 0xF3, (byte) 0xB9, (byte) 0xCA, (byte) 0xC2,
    (byte) 0xFC, (byte) 0x63, (byte) 0x25, (byte) 0x51
  };

  private static ECParams instance;

  private ECParamsP256() {}

  static ECParams getInstance() {
    if (instance == null) {
      instance = new ECParamsP256();
    }
    return instance;
  }

  static void terminate() {
    // NOTE: It is the responsibility of the caller to perform garbage collection
    instance = null;
  }

  @Override
  protected byte[] getA() {
    return a;
  }

  @Override
  protected byte[] getB() {
    return b;
  }

  @Override
  protected byte[] getG() {
    return G;
  }

  @Override
  protected byte[] getP() {
    return p;
  }

  @Override
  protected byte[] getN() {
    return n;
  }

  @Override
  protected short getH() {
    return H;
  }
}
