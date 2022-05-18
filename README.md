# spring-entitytodto-mapstruct


# To Configure MapStruct
_STEP -1_
**Add below dependency in pom.xml**


<pre>
<code>
   &lt;dependency&gt;
            &lt;groupId&gt;org.mapstruct&lt;/groupId&gt;
                        &lt;artifactId&gt;mapstruct&lt;/artifactId&gt;
                        &lt;version&gt;1.4.2.Final&lt;/version&gt;
                    &lt;/dependency&gt; </code>
 </pre> 
 _STEP -2_
  **And add below plugin in build plugins**
 <pre>
 <code>
 &lt;plugin&gt;
      &lt;groupId&gt;org.apache.maven.plugins&lt;/groupId&gt;
          &lt;artifactId&gt;maven-compiler-plugin&lt;/artifactId&gt;
              &lt;version&gt;3.8.1&lt;/version&gt; &lt;!-- or newer version --&gt;
                &lt;configuration&gt;
                     &lt;source&gt;8&lt;/source&gt; &lt;!-- depending on your project --&gt;
                     &lt;target&gt;8&lt;/target&gt; &lt;!-- depending on your project --&gt;
                     &lt;annotationProcessorPaths&gt;
                         &lt;path&gt;
                             &lt;groupId&gt;org.mapstruct&lt;/groupId&gt;
                             &lt;artifactId&gt;mapstruct-processor&lt;/artifactId&gt;
                             &lt;version&gt;1.4.2.Final&lt;/version&gt;
                         &lt;/path&gt;
                         &lt;path&gt;
                             &lt;groupId&gt;org.projectlombok&lt;/groupId&gt;
                             &lt;artifactId&gt;lombok&lt;/artifactId&gt;
                             &lt;version&gt;1.18.12&lt;/version&gt;
                         &lt;/path&gt;
                     &lt;/annotationProcessorPaths&gt;
                 &lt;/configuration&gt;
   &lt;/plugin&gt;
   </code>
    </pre>
    
    
   
    
  _STEP -3_            
------------------------------------**_sample example_**--------------------
 <pre>
 <code>
@Mapper(implementationPackage = "mapper.impl")
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
    ProductDTO toProductDTO(Product product);
    @InheritInverseConfiguration
    Product toProduct(ProductDTO productDTO);}
 </code>
    </pre>
    
  _STEP -4_After Adding dependencies and configuring with annotations
do **mvn clean** and **mvn clean install** 
It will generate code  in target/generated-sources/annotations/mapper/impl
  
 _STEP -5_
**And implement below code in either controller or service layer as below**
 <pre>
 <code>
  public static final ProductMapper INSTANCE = ProductMapper.INSTANCE;
</code>
    </pre>
        
        
