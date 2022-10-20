package model;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class DVDhistory implements Serializable{
 private Date lendDate;
 private Date returnDate;
 private int cost;
 
 
 
 
 
}
