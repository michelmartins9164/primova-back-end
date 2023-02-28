package com.primova.primova.model;

public class Predict {
        public String[] messages;
        public String[] services;
        public Boolean feedbackEnabled;

        public String[] getMessages() {
            return messages;
        }

        public void setMessages(String[] messages) {
            this.messages = messages;
        }

        public String[] getServices() {
            return services;
        }

        public void setServices(String[] services) {
            this.services = services;
        }

        public Boolean getFeedbackEnabled() {
            return feedbackEnabled;
        }

        public void setFeedbackEnabled(Boolean feedbackEnabled) {
            this.feedbackEnabled = feedbackEnabled;
        }
    }
