terraform {
  backend "s3" {
    bucket = "nomnomation-bucket"
    key    = "instance/terraform.tfstate"
    region = "us-east-2"
  }
}