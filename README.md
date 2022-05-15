# spring-entitytodto-mapstruct


# To Configure MapStruct
add below dependency in pom.xml

  <dependency>
            <groupId>org.mapstruct</groupId>
            <artifactId>mapstruct</artifactId>
            <version>1.4.2.Final</version>
        </dependency>
 
 and add below plugin in build plugins
  <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.8.1</version> <!-- or newer version -->
                <configuration>
                    <source>8</source> <!-- depending on your project -->
                    <target>8</target> <!-- depending on your project -->
                    <annotationProcessorPaths>
                        <path>
                            <groupId>org.mapstruct</groupId>
                            <artifactId>mapstruct-processor</artifactId>
                            <version>1.4.2.Final</version>
                        </path>
                        <path>
                            <groupId>org.projectlombok</groupId>
                            <artifactId>lombok</artifactId>
                            <version>1.18.12</version>
                        </path>
                    </annotationProcessorPaths>
                </configuration>
            </plugin>
            
------------------------------------sample example--------------------
@Mapper(implementationPackage = "mapper.impl")
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    ProductDTO toProductDTO(Product product);
    @InheritInverseConfiguration
    Product toProduct(ProductDTO productDTO);

}
-------------------------------------------------
and implement in either controller or service layer as below

  public static final ProductMapper INSTANCE = ProductMapper.INSTANCE;

        
        
