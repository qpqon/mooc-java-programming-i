/*
 * MIT License
 * 
 * Author: Daniel Menke
 * 
 * This code is free to use, modify, and distribute under the MIT License.
 * See LICENSE file for details.
 * 
 * Course: https://java-programming.mooc.fi/
 */
public class Room {
    private String code;
    private int seats;
    
    public Room(String classCode, int numberOfSeats) {
        this.code = classCode;
        this.seats = numberOfSeats;
    }
}
