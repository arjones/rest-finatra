-- Adjust search_path
CREATE SCHEMA IF NOT EXISTS portfolio;
ALTER DATABASE portfolio SET search_path="$user", "public";
SET search_path TO "$user", "public";