
# Spring Boot Metrics Monitoring with Prometheus and Grafana

This project is a Spring Boot application integrated with Prometheus to expose application metrics, and Grafana to visualize those metrics on customizable dashboards.

## Features

- ✅ Spring Boot application with Actuator
- 📈 Metrics exposed via `/actuator/prometheus`
- 🔗 Prometheus integration using Prometheus Java client dependencies
- 📊 Grafana OSS dashboard for visualization

## Tech Stack

- **Spring Boot** (Actuator for metrics)
- **Prometheus** (for metrics scraping and monitoring)
- **Grafana OSS** (for dashboard and visualization)

---

## Getting Started

### Prerequisites

- Java 17+ (or the version your Spring Boot app uses)
- Docker (recommended for Prometheus & Grafana)
- Maven or Gradle

---

## Setup Guide

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/your-repo.git
cd your-rep
