/*
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/*
 * PyroInputConsumer.java
 * Copyright (C) 2019 University of Waikato, Hamilton, New Zealand
 */

package adams.flow.core;

/**
 * Interface for Pyro calls that can process input.
 * 
 * @author  fracpete (fracpete at waikato dot ac dot nz)
 */
public interface PyroInputConsumer
  extends PyroCall {
  
  /**
   * Returns the class that the consumer accepts.
   * 
   * @return		the Class of objects that can be processed
   */
  public Class[] accepts();

  /**
   * The method that accepts the input object.
   * 
   * @param obj		the object to accept and process
   */
  public void input(Object obj);
}
