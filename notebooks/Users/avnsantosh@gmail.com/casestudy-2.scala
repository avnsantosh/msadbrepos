// Databricks notebook source
// MAGIC %sql
// MAGIC 
// MAGIC CREATE database if not exists PracticeDB;

// COMMAND ----------

// MAGIC %sql
// MAGIC create table if not exists PracticeDB.Customers
// MAGIC using CSV
// MAGIC options
// MAGIC (
// MAGIC path "/mnt/data/customers/*.csv",
// MAGIC sep ",",
// MAGIC header "true",
// MAGIC inferSchema "true"
// MAGIC )

// COMMAND ----------

// MAGIC %sql
// MAGIC 
// MAGIC select count(*) from PracticeDB.Customers

// COMMAND ----------

// MAGIC %sql
// MAGIC create table if not exists PracticeDB.Products
// MAGIC using JSON
// MAGIC options
// MAGIC (
// MAGIC path "/mnt/data/products/*.json",
// MAGIC multiline "true",
// MAGIC failfast "true"
// MAGIC )

// COMMAND ----------

// MAGIC %sql
// MAGIC create table if not exists PracticeDB.Orders
// MAGIC using CSV
// MAGIC options
// MAGIC (
// MAGIC path "/mnt/data/orders/*.csv",
// MAGIC sep ",",
// MAGIC header "true",
// MAGIC inferSchema "true"
// MAGIC )

// COMMAND ----------

// MAGIC %sql
// MAGIC 
// MAGIC select count(*) from PracticeDB.Orders

// COMMAND ----------

// MAGIC %sql
// MAGIC 
// MAGIC select count(*) from PracticeDB.Products