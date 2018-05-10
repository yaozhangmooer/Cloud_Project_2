# Cloud_Project_2

## Implementation

### Twitter Harvester
`nohup python ../twitter_harvester/streaming_api.py -h <dbhostname> -p <dbport> -d <db> &> twt_harvester.out &`
or 
`bash bash_script/run_twt_harvester.sh`
The bash script use default option (127.0.0.1:5984 'tweet')

### Data processor

`export MPJ_HOME=/path/to/mpj/`

`export PATH=$MPJ_HOME/bin:$PATH`

`mpjrun.sh -np 4 cloudProject2.jar`

### Web Application
`bash bash_script/setup_server`
