CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE coupons (
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    code VARCHAR(100) NOT NULL,
    discount INTEGER NOT NULL,
    expires_at Date NOT NULL,
    event_id UUID,
    FOREIGN KEY (event_id) REFERENCES events(id) ON DELETE CASCADE
);