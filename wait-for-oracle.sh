#!/bin/bash

set -e

# Function to check database connection
wait_for_oracle() {
  sleep 50
}

# Call the function to wait for the database
wait_for_oracle

# Execute the command passed to the script
exec "$@"