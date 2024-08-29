create table if not exists customized_api_function(
function_code varchar(255) not null,
function_name varchar(255) null,
parameters varchar(255) null,
serverless varchar(255) null,
lambda_name varchar(255) null,
environment_variables varchar(255) null,
system_variables varchar(255) null,
test_data Integer null,
variable_prediction varchar(255) null,
valid_data_sample varchar(255) null,
entity_state varchar(255) null,
constraint customized_api_function_pk primary key(function_code));