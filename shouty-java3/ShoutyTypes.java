import cucumber.api.TypeRegistry;
import io.cucumber.cucumberexpressions.CaptureGroupTransformer;
import io.cucumber.cucumberexpressions.ParameterType;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.TableEntryTransformer;

import java.util.Locale;

import static java.lang.Integer.parseInt;

/*
class PersonLocation {
    String name;
    int x;
    int y;

    public PersonLocation(String name_, int x_, int y_) {
        name = name_;
        x = x_;
        y = y_;
    }

    public String getName() {
        return name;
    }

    public Coordinate getLocation() {
        return new Coordinate(x, y);
    }
}
*/

public class ShoutyTypes implements cucumber.api.TypeRegistryConfigurer {
    @Override
    public Locale locale() {
        return Locale.ENGLISH;
    }

    @Override
    public void configureTypeRegistry(TypeRegistry typeRegistry) {
      /*
      typeRegistry.defineDataTableType(new DataTableType(PersonLocation.class,
          (TableEntryTransformer<PersonLocation>) row -> {
              String name = row.get("name");
              int x = parseInt(row.get("x"));
              int y = parseInt(row.get("y"));
              return new PersonLocation(name, x, y);
          }));
      */
    }

}
