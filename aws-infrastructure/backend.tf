terraform {
  backend "s3" {
    bucket = "nomnomation-bucket"
    key    = "aws-infrastructure/terraform.tfstate"
    region = "us-east-2"
  }
}