/**
 * This file is part of LWC (https://github.com/Hidendra/LWC)
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package me.taylorkelly.bigbrother.griefcraft.util;

public class UpdaterFile {

	/**
	 * The remote url location
	 */
	private String remoteLocation;

	/**
	 * The local url location
	 */
	private String localLocation;

	public UpdaterFile(String location) {
		remoteLocation = location;
		localLocation = location;
	}

	/**
	 * @return the local file location
	 */
	public String getLocalLocation() {
		return localLocation;
	}

	/**
	 * @return the remote url location
	 */
	public String getRemoteLocation() {
		return remoteLocation;
	}

	/**
	 * Set the local file location
	 * 
	 * @param localLocation
	 */
	public void setLocalLocation(String localLocation) {
		this.localLocation = localLocation;
	}

	/**
	 * Set the remote url location
	 * 
	 * @param remoteLocation
	 */
	public void setRemoteLocation(String remoteLocation) {
		this.remoteLocation = remoteLocation;
	}

}
