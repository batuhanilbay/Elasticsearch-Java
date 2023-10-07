package com.spring.elasticsearch.entity;


import com.spring.elasticsearch.enums.CarType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "cars")
public class Car {

    @Id
    private Long id;

    @Field(name = "brand", type = FieldType.Text)
    private String brand;

    @Field(name = "car_type", type = FieldType.Keyword)
    private CarType type;

    @Field(name = "price", type = FieldType.Long)
    private Long price;

    @Field(name = "origin", type = FieldType.Text)
    private String country;

}