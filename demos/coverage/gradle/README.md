# Building/compiling code
  
  1. `gradle build`
  
# Running tests
  
  2. `gradle test`

# Reporting dependencies
  
  3. `gradle dependencies`

# Filtering output

  4. `gradle dependencies --configuration testCompileClasspath`
  5. `gradle dependencyInsight --configuration testCompileClasspath --dependency junit`

# Generating wrapper files

  6. `gradle wrapper`