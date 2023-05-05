package com.example.watchstopdb;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "Time")
@Table(name = "Time")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StopWatch {

    @Id
    @Column(name = "Id")
    String id;
    @Column(name = "Minutes")
    String minutes;
    @Column(name = "Seconds")
    String seconds;
    @Column(name = "Milliseconds ")
    String milliseconds;

}
