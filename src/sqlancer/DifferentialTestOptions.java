package sqlancer;

import java.util.ArrayList;
import java.util.List;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

@Parameters(separators = "=", commandDescription = "Perform differential testing")
public class DifferentialTestOptions {
    
    @Parameter(names = "--dbs", description = "DBMSs", variableArity = true)
    public List<String> DBMSs = new ArrayList<>();

    public List<String> getDBMSs() {
    	return DBMSs;
    }

}
